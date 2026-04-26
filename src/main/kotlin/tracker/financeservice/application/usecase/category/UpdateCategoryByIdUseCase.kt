package tracker.financeservice.application.usecase.category

import org.springframework.transaction.annotation.Transactional
import tracker.financeservice.application.exception.category.CategoryByIdNotFoundException
import tracker.financeservice.application.usecase.UseCase
import tracker.financeservice.application.usecase.category.commands.UpdateCategoryCommand
import tracker.financeservice.domain.category.Category
import tracker.financeservice.domain.category.CategoryRepository

//@Service
//TODO: uncomment after creating components
class UpdateCategoryByIdUseCase(private val categoryRepository: CategoryRepository)
    : UseCase<UpdateCategoryCommand, Category> {

//    @Transactional
//  TODO: uncomment after creating components
    override fun execute(inboundCommand: UpdateCategoryCommand): Category {
        val existingCategory = categoryRepository.findById(inboundCommand.id) ?:
            throw CategoryByIdNotFoundException(inboundCommand.id)

        val updatedCategory = existingCategory.rename(inboundCommand.name)
        return categoryRepository.save(updatedCategory)
    }
}