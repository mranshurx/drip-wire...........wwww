.class public Lcom/dripclient/wireforge/ProxyComponentFactory;
.super Landroid/app/AppComponentFactory;
.source "SourceFile"


# static fields
.field public static a:Landroid/app/AppComponentFactory;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lcom/dripclient/wireforge/ProxyComponentFactory;

    .line 3
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Landroid/app/AppComponentFactory;-><init>()V

    .line 4
    return-void
.end method

.method public static a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;
    .registers 3

    .line 1
    sget-object v0, Lcom/dripclient/wireforge/ProxyComponentFactory;->a:Landroid/app/AppComponentFactory;

    if-nez v0, :cond_1e

    .line 2
    invoke-static {}, Lcom/dripclient/wireforge/JniBridge;->rcf()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1e

    const/4 v1, 0x1

    .line 4
    :try_start_f
    invoke-static {v0, v1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/dripclient/wireforge/b;->a(Ljava/lang/Object;)Landroid/app/AppComponentFactory;

    move-result-object p0

    sput-object p0, Lcom/dripclient/wireforge/ProxyComponentFactory;->a:Landroid/app/AppComponentFactory;
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_1d} :catch_1e

    return-object p0

    .line 5
    :catch_1e
    :cond_1e
    sget-object p0, Lcom/dripclient/wireforge/ProxyComponentFactory;->a:Landroid/app/AppComponentFactory;

    return-object p0
.end method


# virtual methods
.method public final instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .registers 13

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v4

    if-eqz v4, :cond_35

    .line 3
    :try_start_10
    const-class v5, Landroid/app/AppComponentFactory;

    const-string v6, "instantiateActivity"

    new-array v7, v3, [Ljava/lang/Class;

    const-class v8, Ljava/lang/ClassLoader;

    aput-object v8, v7, v2

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v1

    const-class v8, Landroid/content/Intent;

    aput-object v8, v7, v0

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 4
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    aput-object p2, v3, v1

    aput-object p3, v3, v0

    invoke-virtual {v5, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_34} :catch_35

    return-object v0

    .line 5
    :catch_35
    :cond_35
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method

.method public final instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;
    .registers 12

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    sget-boolean v3, Lcom/dripclient/wireforge/a;->a:Z

    if-nez v3, :cond_2b

    .line 3
    invoke-static {}, Lcom/dripclient/wireforge/a;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    if-eqz v3, :cond_23

    .line 4
    invoke-static {}, Lcom/dripclient/wireforge/a;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/dripclient/wireforge/a;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 6
    invoke-static {v4, v3}, Lcom/dripclient/wireforge/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-static {v3}, Lcom/dripclient/wireforge/JniBridge;->a(Ljava/lang/String;)V

    goto :goto_2b

    .line 8
    :cond_23
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "application info is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_2b
    :goto_2b
    invoke-static {}, Lcom/dripclient/wireforge/JniBridge;->ia()V

    .line 10
    invoke-static {}, Lcom/dripclient/wireforge/JniBridge;->rapn()Ljava/lang/String;

    move-result-object v3

    .line 11
    sget-boolean v4, Lcom/dripclient/wireforge/a;->a:Z

    if-nez v4, :cond_40

    .line 12
    invoke-static {p1}, Lcom/dripclient/wireforge/JniBridge;->cbde(Ljava/lang/ClassLoader;)V

    .line 13
    sput-boolean v2, Lcom/dripclient/wireforge/a;->a:Z

    .line 14
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v4

    goto :goto_44

    .line 15
    :cond_40
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v4

    .line 16
    :goto_44
    sput-boolean v1, Lcom/dripclient/wireforge/a;->b:Z

    if-eqz v4, :cond_7e

    .line 17
    :try_start_48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, "instantiateApplication"

    new-array v7, v0, [Ljava/lang/Class;

    const-class v8, Ljava/lang/ClassLoader;

    aput-object v8, v7, v1

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v2

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 18
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_71

    .line 19
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    aput-object v3, v0, v2

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    return-object v0

    :catch_6f
    nop

    goto :goto_7e

    .line 20
    :cond_71
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    aput-object p2, v0, v2

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;
    :try_end_7d
    .catch Ljava/lang/Exception; {:try_start_48 .. :try_end_7d} :catch_6f

    return-object v0

    .line 21
    :cond_7e
    :goto_7e
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_ad

    .line 22
    :try_start_84
    invoke-static {v3, v1, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_87
    .catch Ljava/lang/ClassNotFoundException; {:try_start_84 .. :try_end_87} :catch_88

    goto :goto_a8

    .line 23
    :catch_88
    invoke-static {}, Lcom/dripclient/wireforge/a;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    if-eqz p2, :cond_a8

    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/dripclient/wireforge/a;->b()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 25
    :cond_a8
    :goto_a8
    invoke-super {p0, p1, v3}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;

    move-result-object p1

    return-object p1

    .line 26
    :cond_ad
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;

    move-result-object p1

    return-object p1
.end method

.method public final instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;
    .registers 11

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    iget-object v2, p2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iget-object v3, p2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/dripclient/wireforge/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v2, p2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v2}, Lcom/dripclient/wireforge/JniBridge;->a(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/dripclient/wireforge/JniBridge;->ia()V

    .line 5
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v2

    .line 6
    invoke-static {p1}, Lcom/dripclient/wireforge/JniBridge;->cbde(Ljava/lang/ClassLoader;)V

    const/4 v3, 0x1

    .line 7
    sput-boolean v3, Lcom/dripclient/wireforge/a;->a:Z

    if-eqz v2, :cond_42

    .line 8
    :try_start_23
    const-class v4, Landroid/app/AppComponentFactory;

    const-string v5, "instantiateClassLoader"

    new-array v6, v1, [Ljava/lang/Class;

    const-class v7, Ljava/lang/ClassLoader;

    aput-object v7, v6, v0

    const-class v7, Landroid/content/pm/ApplicationInfo;

    aput-object v7, v6, v3

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 9
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    aput-object p2, v1, v3

    invoke-virtual {v4, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ClassLoader;
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_41} :catch_42

    return-object v0

    .line 10
    :catch_42
    :cond_42
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;

    move-result-object p1

    return-object p1
.end method

.method public final instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;
    .registers 11

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v3

    if-eqz v3, :cond_2b

    .line 3
    :try_start_c
    const-class v4, Landroid/app/AppComponentFactory;

    const-string v5, "instantiateProvider"

    new-array v6, v2, [Ljava/lang/Class;

    const-class v7, Ljava/lang/ClassLoader;

    aput-object v7, v6, v1

    const-class v7, Ljava/lang/String;

    aput-object v7, v6, v0

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 4
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    aput-object p2, v2, v0

    invoke-virtual {v4, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentProvider;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_2a} :catch_2b

    return-object v0

    .line 5
    :catch_2b
    :cond_2b
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;

    move-result-object p1

    return-object p1
.end method

.method public final instantiateReceiver(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/BroadcastReceiver;
    .registers 13

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v4

    if-eqz v4, :cond_35

    .line 3
    :try_start_10
    const-class v5, Landroid/app/AppComponentFactory;

    const-string v6, "instantiateReceiver"

    new-array v7, v3, [Ljava/lang/Class;

    const-class v8, Ljava/lang/ClassLoader;

    aput-object v8, v7, v2

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v1

    const-class v8, Landroid/content/Intent;

    aput-object v8, v7, v0

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 4
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    aput-object p2, v3, v1

    aput-object p3, v3, v0

    invoke-virtual {v5, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/BroadcastReceiver;
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_34} :catch_35

    return-object v0

    .line 5
    :catch_35
    :cond_35
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateReceiver(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/BroadcastReceiver;

    move-result-object p1

    return-object p1
.end method

.method public final instantiateService(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Service;
    .registers 13

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lcom/dripclient/wireforge/ProxyComponentFactory;->a(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v4

    if-eqz v4, :cond_35

    .line 3
    :try_start_10
    const-class v5, Landroid/app/AppComponentFactory;

    const-string v6, "instantiateService"

    new-array v7, v3, [Ljava/lang/Class;

    const-class v8, Ljava/lang/ClassLoader;

    aput-object v8, v7, v2

    const-class v8, Ljava/lang/String;

    aput-object v8, v7, v1

    const-class v8, Landroid/content/Intent;

    aput-object v8, v7, v0

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 4
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    aput-object p2, v3, v1

    aput-object p3, v3, v0

    invoke-virtual {v5, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Service;
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_34} :catch_35

    return-object v0

    .line 5
    :catch_35
    :cond_35
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateService(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Service;

    move-result-object p1

    return-object p1
.end method
