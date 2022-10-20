package br.com.domingosligiane.cadastro_proj.validation

import br.com.domingosligiane.cadastro_proj.service.CustomerService
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class CpfAvailableValidator(var customerService: CustomerService): ConstraintValidator<CpfAvailable, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {

        return customerService.cpfAvailable(value)
    }

}
