package com.dogs.dogs.api.domain.repository.customer

import com.dogs.dogs.api.presentation.request.customer.CustomerRequest

interface CustomerRepository {
    fun createCustomer(customer: CustomerRequest)
}
