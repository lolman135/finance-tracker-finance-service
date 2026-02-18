package tracker.financeservice.domain.account

import tracker.financeservice.domain.transaction.TransactionType
import java.util.UUID

data class Account(
    val id: UUID,
    val name: String,
    val balance: Long,
    val currency: String,
    val userId: UUID,
    val transactionIds: List<UUID>
) {
    fun rename(newName: String): Account{
        require(newName.isNotBlank()){"Name cannot be blank"}
        return copy(name = newName)
    }


}