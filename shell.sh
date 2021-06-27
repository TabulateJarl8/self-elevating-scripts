if [ "$EUID" != 0 ]; then
	sudo "$0" "$@"
	exit $?
fi

# Code goes here
echo "I am elevated"
