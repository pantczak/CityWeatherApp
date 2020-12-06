import csv

with open('Raport.csv', newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=' ', quotechar='|')
    csvfile.readline()
    time = 0.0
    CPU = 0.0
    Memory = 0.0
    IO = 0.0
    counter = 0.0
    for row in spamreader:
        y = str(row)
        y = y[:-2]
        x = y.split(',')
        counter += 1
        print(x)
        CPU += float(x[1])
        Memory += float(x[2])
        IO += float(x[3])
    time /= counter
    CPU /= counter
    Memory /= counter
    IO /= counter
    print("CPU: "+str(CPU))
    print("Pamięć: "+str(Memory))
    print("I/O: "+str(IO))
