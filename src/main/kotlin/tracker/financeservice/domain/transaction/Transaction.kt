package tracker.financeservice.domain.transaction

import java.time.LocalDateTime
import java.util.UUID

data class Transaction(
    val id: UUID,
    val type: TransactionType,
    val description: String,
    val categoryId: UUID,
    val accountId: UUID,
    val amount: Long,
    val createdAt: LocalDateTime
)

// Transaction is unredacted domain. It's values cannot be changed during lifecycle of this domain