terraform {
  backend "remote" {
    organization = "QA_FY"
    workspaces {
      name = "Miscellaneous"
    }
  }
}
