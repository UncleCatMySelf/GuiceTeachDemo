package com.myself.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.util.Arrays;
import java.util.List;

/**
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 16:04 2018\4\22 0022
 */
public class CommandLineModule extends AbstractModule{

    private final String[] args;

    public CommandLineModule(String[] args) {
        this.args = args;
    }

    @Override
    protected void configure() {

    }

    @Provides @Args
    List<String> getCommandLineArgs(){
        return Arrays.asList(args).subList(1,args.length);
    }
}
