package edu.uoc.pac4.data.oauth

import edu.uoc.pac4.data.SessionManager

/**
 * Created by alex on 11/21/20.
 */
class OAuthAuthenticationRepository(
    // TODO: Add any datasources you may need
private val tokensDataSource: TokensDataSource,
private val sessionManager: SessionManager
) : AuthenticationRepository {

    override suspend fun isUserAvailable(): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun login(authorizationCode: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun logout() {
        TODO("Not yet implemented")
    }
}