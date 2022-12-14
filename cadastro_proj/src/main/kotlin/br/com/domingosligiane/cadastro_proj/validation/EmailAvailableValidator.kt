package br.com.domingosligiane.cadastro_proj.validation

import br.com.domingosligiane.cadastro_proj.service.CustomerService
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class EmailAvailableValidator(var customerService: CustomerService): ConstraintValidator<EmailAvailable, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {

        return customerService.emailAvailable(value)
    }

}
