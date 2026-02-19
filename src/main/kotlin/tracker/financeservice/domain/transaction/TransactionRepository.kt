package tracker.financeservice.domain.transaction

import tracker.financeservice.domain.BaseDomainRepository
import java.util.UUID

interface TransactionRepository : BaseDomainRepository<UUID, Transaction> {
    fun findAllByAccountId(accountId: UUID): List<Transaction>
    fun findAllByCategoryIdAndAccountID(categoryId: UUID, accountId: UUID): List<Transaction>
    fun findAllByTypeAndAccountId(type: TransactionType, accountId: UUID): List<Transaction>
}