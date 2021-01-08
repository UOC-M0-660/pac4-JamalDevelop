package edu.uoc.pac4.data.di

import edu.uoc.pac4.data.SessionManager
import edu.uoc.pac4.data.streams.StreamsRepository
import edu.uoc.pac4.data.streams.TwitchStreamsRepository
import org.koin.dsl.module

/**
 * Created by alex on 11/21/20.
 */

val dataModule = module {
    // TODO: Init your Data Dependencies

    // Streams example
    // single<StreamsRepository> { TwitchStreamsRepository() }

    // Data Sources
//    single { SessionManager(get()) }
//    single { TokensDataSource(Network.createHttpClient(get())) }
//    single { StreamsDataSource(Network.createHttpClient(get())) }
//    single { UserDataSource(Network.createHttpClient(get())) }
//
//    // Repositories
//    single<AuthenticationRepository>{ OAuthAuthenticationRepository(get(), get()) }
//    single<StreamsRepository> { TwitchStreamsRepository(get()) }
//    single<UserRepository> { TwitchUserRepository(get()) }
}