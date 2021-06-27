import os

try:
	import elevate # pip3 install elevate; its worth the dependency because it would be messy to include it all in the file
	elevate.elevate(graphical=False)
except ImportError:
	# Ignore if elevate isn't installed but we are root
	if os.getuid() != 0:
		raise

print("I am elevated")
