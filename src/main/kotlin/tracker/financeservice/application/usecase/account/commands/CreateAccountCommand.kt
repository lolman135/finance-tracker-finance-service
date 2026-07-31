package tracker.financeservice.application.usecase.account.commands

data class CreateAccountCommand(
    val name: String?,
    val currency: String?,
    val balance: Long = 0,

)