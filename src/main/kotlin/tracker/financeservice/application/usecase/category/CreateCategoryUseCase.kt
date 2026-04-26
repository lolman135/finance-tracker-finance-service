package tracker.financeservice.application.usecase.category

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import tracker.financeservice.application.exception.category.CategoryAlreadyExistsException
import tracker.financeservice.application.usecase.UseCase
import tracker.financeservice.application.usecase.category.commands.CreateCategoryCommand
import tracker.financeservice.domain.category.Category
import tracker.financeservice.domain.category.CategoryRepository
import java.util.UUID

//@Service
//TODO: uncomment after creating components
class CreateCategoryUseCase(private val categoryRepository: CategoryRepository)
    : UseCase<CreateCategoryCommand, Category> {

//    @Transactional
//    TODO: uncomment after creating components
    override fun execute(inboundCommand: CreateCategoryCommand): Category {
        if (categoryRepository.existsByName(inboundCommand.name))
            throw CategoryAlreadyExistsException()

        val newCategory = Category(id = UUID.randomUUID(), name = inboundCommand.name)
        return categoryRepository.save(newCategory)
    }
}