package tracker.financeservice.application.usecase.category.commands

data class FindAllCategoriesPageableCommand(
    val pageAmount: Int,
    val size: Int
)