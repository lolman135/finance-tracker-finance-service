package tracker.financeservice.application.exception.transaction

import tracker.financeservice.application.exception.DomainNotFoundException
import java.util.UUID

class TransactionByIdNotFoundException(val id: UUID) : DomainNotFoundException("Transaction with id=$id not found")