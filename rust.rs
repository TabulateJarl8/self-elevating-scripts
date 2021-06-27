use nix::unistd::Uid;

fn main() {
	if !Uid::effective().is_root() {
		panic!("Please run this program as root");
	}

	println!("I am elevated");
}