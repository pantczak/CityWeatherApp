CREATE ROLE IF NOT EXISTS nbd2020 WITH PASSWORD = 'cassandra2020' AND LOGIN = true;

CREATE KEYSPACE IF NOT EXISTS weatherspace WITH REPLICATION ={'class':'SimpleStrategy','replication_factor':3};

GRANT CREATE PERMISSION on KEYSPACE weatherspace to nbd2020;




-- CREATE KEYSPACE IF NOT EXISTS WeatherSpace
--     WITH REPLICATION ={'class':'SimpleStrategy','replication_factor':3};
