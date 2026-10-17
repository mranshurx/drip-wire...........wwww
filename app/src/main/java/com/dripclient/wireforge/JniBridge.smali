.class public Lcom/dripclient/wireforge/JniBridge;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)V
    .registers 9

    .line 1
    const-string v0, "lib830f622c2304076e.so"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 2
    :try_start_6
    invoke-static {}, Lcom/dripclient/wireforge/a;->a()Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "dpt-libs"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_5b

    .line 5
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_34
    if-ge v3, v1, :cond_5b

    aget-object v4, p0, v3

    .line 6
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 7
    aget-object v5, v0, v2

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_58

    .line 10
    invoke-static {v4}, Ljava/lang/System;->load(Ljava/lang/String;)V
    :try_end_58
    .catchall {:try_start_6 .. :try_end_58} :catchall_5b

    :cond_58
    add-int/lit8 v3, v3, 0x1

    goto :goto_34

    :catchall_5b
    :cond_5b
    return-void
.end method

.method public static native cbde(Ljava/lang/ClassLoader;)V
.end method

.method public static native clinit()V
.end method

.method public static native craoc(Ljava/lang/String;)V
.end method

.method public static native gap()Ljava/lang/String;
.end method

.method public static native gdp()Ljava/lang/String;
.end method

.method public static native ia()V
.end method

.method public static native ra(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public static native rapn()Ljava/lang/String;
.end method

.method public static native rcf()Ljava/lang/String;
.end method

.method public static native rde(Ljava/lang/ClassLoader;Ljava/lang/String;)V
.end method
