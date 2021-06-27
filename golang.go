package main

import (
	"fmt"
	"log"
	"os/user"
)

func isRoot() bool {
	// I haven't tested this on Windows, so it may not work
	currentUser, err := user.Current()
	if err != nil {
		log.Fatalf("[isRoot] Unable to get current user: %s", err)
	}
	return currentUser.Username == "root"
}

func main() {
	if !isRoot() {
		log.Fatalln("Please run this program as root")
	}

	fmt.Println("I am elevated")

}