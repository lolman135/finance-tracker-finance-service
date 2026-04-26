package tracker.financeservice.application.usecase.category

import org.springframework.stereotype.Service
import tracker.financeservice.application.exception.category.CategoryByNameNotFoundException
import tracker.financeservice.application.usecase.UseCase
import tracker.financeservice.domain.category.Category
import tracker.financeservice.domain.category.CategoryRepository

//@Service
//TODO: uncomment after creating components
class FindCategoryByNameUseCase(private val categoryRepository: CategoryRepository) : UseCase<String, Category> {

    override fun execute(name: String) = categoryRepository.findByName(name)
        ?: throw CategoryByNameNotFoundException(name)
}