if Process.uid != 0
	$stderr.puts("Please run this program as root")
	exit 1
end

puts "I am elevated"