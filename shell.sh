if [ "$EUID" != 0 ]; then
	sudo "$0" "$@"
	echo $?
fi

# Code goes here
echo "I am elevated"