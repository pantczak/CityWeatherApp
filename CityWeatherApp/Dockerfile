FROM cassandra:3.11.9

ENV LANG C.UTF-8

COPY *.cql /docker-entrypoint-initdb.d/

COPY entrypoint.sh /

RUN ["chmod", "+x", "/entrypoint.sh"]

ENTRYPOINT ["/entrypoint.sh"]
CMD ["cassandra", "-f"]

RUN sed -i 's/^authenticator.\+$/authenticator: PasswordAuthenticator/g' /etc/cassandra/cassandra.yaml
RUN sed -i 's/^authorizer.\+$/authorizer: org.apache.cassandra.auth.CassandraAuthorizer/g' /etc/cassandra/cassandra.yaml
