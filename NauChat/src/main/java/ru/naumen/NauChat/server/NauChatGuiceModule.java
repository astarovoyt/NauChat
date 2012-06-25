/*$Id$*/
package ru.naumen.NauChat.server;

import net.customware.gwt.dispatch.server.DefaultActionHandlerRegistry;
import net.customware.gwt.dispatch.server.InstanceActionHandlerRegistry;
import ru.naumen.NauChat.server.dispatch.GetMessageListActionHandler;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * @author ivodopyanov
 * @since 22.06.2012
 */
public class NauChatGuiceModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(MessagingService.class).to(MessagingServiceImpl.class).in(Singleton.class);
        bind(InstanceActionHandlerRegistry.class).to(DefaultActionHandlerRegistry.class);
        bind(GetMessageListActionHandler.class);
    }
}