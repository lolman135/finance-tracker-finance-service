package tracker.financeservice.application.usecase.category

import tracker.financeservice.application.usecase.UseCase
import tracker.financeservice.application.usecase.category.commands.FindAllCategoriesPageableCommand
import tracker.financeservice.domain.PageRequest
import tracker.financeservice.domain.PageResponse
import tracker.financeservice.domain.category.Category
import tracker.financeservice.domain.category.CategoryRepository

//@Service
//TODO: uncomment after creating components
class FindAllCategoryPageableUseCase(
    private val categoryRepository: CategoryRepository
) : UseCase<FindAllCategoriesPageableCommand, PageResponse<Category>> {

    override fun execute(inboundCommand: FindAllCategoriesPageableCommand) =
        categoryRepository.findAllByPages(PageRequest(inboundCommand.pageAmount, inboundCommand.size))
}