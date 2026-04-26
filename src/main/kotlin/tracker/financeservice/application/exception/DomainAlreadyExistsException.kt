package tracker.financeservice.application.exception

open class DomainAlreadyExistsException(override val message: String) : RuntimeException(message)