package tracker.financeservice.application.exception

open class DomainNotFoundException(override val message: String) : RuntimeException(message)