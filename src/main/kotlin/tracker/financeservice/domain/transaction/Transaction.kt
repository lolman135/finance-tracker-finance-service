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

// Tgit ransaction is unredacted domain.