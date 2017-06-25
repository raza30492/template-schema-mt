package com.jazasoft.mt.tenant;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

/**
 * Created by mdzahidraza on 26/06/17.
 */
@Component
public class CurrentTennatIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        return TenantContext.getCurrentTenant();
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
