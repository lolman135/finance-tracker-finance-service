package tracker.financeservice.domain.account

import tracker.financeservice.domain.BaseDomainRepository
import java.util.UUID

interface AccountRepository : BaseDomainRepository<UUID, Account> {
    fun findByName(name: String): Account?
    fun findAllByUserId(userId: UUID): List<Account>
}