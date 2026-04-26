package tracker.financeservice.application.exception.account

import tracker.financeservice.application.exception.DomainNotFoundException
import java.util.UUID

class AccountByIdNotFoundException(val id: UUID) : DomainNotFoundException("Account with id=$id not found")