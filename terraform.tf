terraform {
  required_version = ">= 0.12.26"
}
# website::tag::1:: The simplest possible Terraform module: it just outputs "Hello, World!"
output "hello_everyone" {
  value = "Hello, Everyone! Happy new year 2023 to you all!"
}
