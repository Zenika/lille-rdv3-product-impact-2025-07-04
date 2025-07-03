
package com.zenika;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;

@Named
@ApplicationScoped
public class ProductImpactService {

    @Inject
    @RestClient
    ProductCompositionService productCompositionService;

    @Inject
    EntityManager em;

}
