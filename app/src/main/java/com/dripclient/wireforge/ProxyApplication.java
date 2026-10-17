.class public Lcom/dripclient/wireforge/ProxyApplication;
.super Landroid/app/Application;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/app/Application;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 4
    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->b:Landroid/app/Application;

    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .registers 2

    .line 1
    sget-boolean v0, Lcom/dripclient/wireforge/a;->b:Z

    .line 3
    if-eqz v0, :cond_21

    .line 5
    iget-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_21

    .line 13
    iget-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    .line 15
    invoke-static {v0}, Lcom/dripclient/wireforge/JniBridge;->ra(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/app/Application;

    .line 21
    iput-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->b:Landroid/app/Application;

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    iget-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    .line 28
    invoke-static {v0}, Lcom/dripclient/wireforge/JniBridge;->craoc(Ljava/lang/String;)V

    .line 31
    const/4 v0, 0x0

    .line 32
    sput-boolean v0, Lcom/dripclient/wireforge/a;->b:Z

    .line 34
    :cond_21
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .registers 5

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 3
    sget-boolean v0, Lcom/dripclient/wireforge/a;->a:Z

    if-nez v0, :cond_36

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_2e

    .line 5
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/dripclient/wireforge/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v0}, Lcom/dripclient/wireforge/JniBridge;->a(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/dripclient/wireforge/JniBridge;->ia()V

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/dripclient/wireforge/JniBridge;->cbde(Ljava/lang/ClassLoader;)V

    const/4 p1, 0x1

    .line 10
    sput-boolean p1, Lcom/dripclient/wireforge/a;->a:Z

    goto :goto_36

    .line 11
    :cond_2e
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "application info is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_36
    :goto_36
    invoke-static {}, Lcom/dripclient/wireforge/JniBridge;->rapn()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    return-void
.end method

.method public final createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 3
    invoke-virtual {p0}, Lcom/dripclient/wireforge/ProxyApplication;->a()V

    .line 4
    iget-object p1, p0, Lcom/dripclient/wireforge/ProxyApplication;->b:Landroid/app/Application;

    return-object p1

    .line 5
    :cond_e
    invoke-super {p0, p1, p2}, Landroid/app/Application;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public final getPackageName()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/dripclient/wireforge/ProxyApplication;->a:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_b

    .line 9
    const-string v0, ""

    .line 11
    return-object v0

    .line 12
    :cond_b
    invoke-super {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final onCreate()V
    .registers 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 4
    invoke-virtual {p0}, Lcom/dripclient/wireforge/ProxyApplication;->a()V

    .line 7
    return-void
.end method
