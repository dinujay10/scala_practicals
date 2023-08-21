class Account(val accountNumber: String, var balance: Double) {
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $amount. New balance: $balance")
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
    println(s"Withdrew $amount. New balance: $balance")
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    require(amount <= balance, "Insufficient balance for transfer")

    balance -= amount
    targetAccount.balance += amount

    println(s"Transferred $amount to account ${targetAccount.accountNumber}")
    println(s"New balance in this account: $balance")
    println(s"New balance in target account (${targetAccount.accountNumber}): ${targetAccount.balance}")
  }
}

object Q3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account("A12345", 1000.0)
    val account2 = new Account("B67890", 500.0)

    println(s"Initial balance in account 1: ${account1.balance}")
    println(s"Initial balance in account 2: ${account2.balance}")

    account1.deposit(200.0)
    account1.withdraw(100.0)
    account1.transfer(300.0, account2)
  }
}
