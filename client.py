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

}

def init_socket():
	try:
		s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		print ("Socket successfully created")
		return s
	except socket.error as err:
		#raise
		print "socket creation failed with error %s" %(err)

def get_ip(Host):
	try:
		host_ip = socket.gethostbyname(Host)
		return host_ip
	except socket.gaierror:
		#raise
		print "there was an error resolving the host"
    	sys.exit()

def connecttohost(ip,port):
	try:
		s.connect((ip,port))
		print ("Connection successfully to %s on %s" %(sys.argv[1], port))
		print s.recv(1024)
		s.close
	except socket.error as serr:
		if socket.error != errno.ECONNREFUSED:
			raise serr
		#print "connection Failed %s " %exc

def main():
	s = init_socket()
	ip = get_ip(sys.argv[1])
	port = service_port[sys.argv[2]]

if __name__ == "__main__":
	main()
