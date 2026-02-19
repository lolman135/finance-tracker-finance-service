package tracker.financeservice.domain.account

import tracker.financeservice.domain.transaction.Transaction
import tracker.financeservice.domain.transaction.TransactionType
import java.util.UUID

data class Account(
    val id: UUID,
    val name: String,
    val balance: Long,
    val currency: String,
    val userId: UUID,
) {
    fun rename(newName: String): Account{
        require(newName.isNotBlank()){"Name cannot be blank"}
        return copy(name = newName)
    }

    fun applyTransaction(transaction: Transaction): Account {
        val newBalance = when(transaction.type){
            TransactionType.INCOME -> balance + transaction.amount
            TransactionType.EXPENSE -> balance - transaction.amount
        }

        return copy(balance = newBalance)
    }
}