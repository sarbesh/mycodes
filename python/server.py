import errno
import sys
import ssl
import argparse
import time
import random
import socket

service_port = {

	"http":80,
	"ftp":21,
	"ssh":22,
	"Telnet":23,
	"SMTP":25,
	"HTTPS":443,

}

def conn_port(p):
	if p in service_port:
		return service_port[p]
	else:
		print "service_port not found in database"
		print "service validation for port not found"
		sys.exit()

def init_socket():
	try:
		s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		print ("Socket successfully created")
		return s
	except socket.error as err:
		print "socket creation failed with error %s" %(err)

def get_ip(Host):
	try:
		host_ip = socket.gethostbyname(Host)
		return host_ip
	except socket.gaierror:
		print "there was an error resolving the host"
    	sys.exit()

def binding(HOST, PORT):
	try:
		s.bind((HOST,PORT))
	except socket.error as e:
		print "Can't bind port %s as the port is already in use" %e

def main():

    HOST = "127.0.0.1"                 # Symbolic name meaning all available interfaces
    PORT = conn_port(sys.argv[1])              # Arbitrary non-privileged port
    s = init_socket()
    s.bind((HOST, PORT))
    print 'Listening on', PORT
    s.listen(5)
    conn, addr = s.accept()
    print 'Connected by', addr
    while 1:
		data = conn.recv(1024)
		print data
		data = raw_input()
		conn.sendall(data)
		if not data:
			break
			conn.close()

if __name__ == "__main__":
	main()
