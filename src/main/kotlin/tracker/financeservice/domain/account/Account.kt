package tracker.financeservice.domain.account

import tracker.financeservice.domain.transaction.Transaction
import tracker.financeservice.domain.transaction.TransactionType
import java.util.UUID

data class Account(
    val id: UUID,
    val name: String,
    val balance: Long,
    val currency: String = "USD",
    val userId: UUID,
) {
    fun rename(newName: String): Account{
        require(newName.isNotBlank()){"Name cannot be blank"}
        return copy(name = newName)
    }

    fun applyTransaction(convertedAmount: Long, type: TransactionType): Account {
        val newBalance = when(type){
            TransactionType.INCOME -> balance + convertedAmount
            TransactionType.EXPENSE -> balance - convertedAmount
        }
        return copy(balance = newBalance)
    }

    fun correctBalance(newBalance: Long): Account{
        // You can set balance less than zero because several banks allows you to have negative balance
        return copy(balance = newBalance)
    }
}