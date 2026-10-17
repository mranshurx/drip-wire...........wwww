.class public abstract Lcom/dripclient/wireforge/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:Z = false

.field public static volatile b:Z = true


# direct methods
.method public static a()Ljava/lang/String;
    .registers 4

    .line 1
    :try_start_0
    const-string v0, "dalvik.system.VMRuntime"

    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getRuntime"

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    const-string v3, "vmInstructionSet"

    .line 20
    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/String;
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_1d} :catch_1e

    .line 30
    return-object v0

    .line 31
    :catch_1e
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    const-string v0, "arm64"

    .line 37
    return-object v0
.end method

.method public static b()Landroid/content/pm/ApplicationInfo;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    const-string v1, "android.app.ActivityThread"

    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    move-result-object v1

    .line 8
    const-string v2, "sCurrentActivityThread"

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    const-string v4, "mBoundApplication"

    .line 24
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    move-result-object v2

    .line 39
    const-string v4, "appInfo"

    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Landroid/content/pm/ApplicationInfo;
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_35} :catch_36

    .line 54
    return-object v1

    .line 55
    :catch_36
    move-exception v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 59
    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .registers 14

    .line 1
    invoke-static {}, Lcom/dripclient/wireforge/a;->a()Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "dpt-libs"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "assets/vwwwwwvwww/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/lib830f622c2304076e.so"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_4d

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 9
    :cond_4d
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "lib830f622c2304076e.so"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v1, -0x1

    const/16 v3, 0x1000

    const-wide/16 v4, 0x0

    if-eqz p1, :cond_ad

    .line 11
    :try_start_71
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_76
    .catchall {:try_start_71 .. :try_end_76} :catchall_ad

    .line 12
    :try_start_76
    new-instance v6, Ljava/util/zip/CheckedInputStream;

    new-instance v7, Ljava/util/zip/CRC32;

    invoke-direct {v7}, Ljava/util/zip/CRC32;-><init>()V

    invoke-direct {v6, p1, v7}, Ljava/util/zip/CheckedInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V
    :try_end_80
    .catchall {:try_start_76 .. :try_end_80} :catchall_98

    .line 13
    :try_start_80
    new-array v7, v3, [B

    .line 14
    :goto_82
    invoke-virtual {v6, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    if-eq v8, v1, :cond_89

    goto :goto_82

    .line 15
    :cond_89
    invoke-virtual {v6}, Ljava/util/zip/CheckedInputStream;->getChecksum()Ljava/util/zip/Checksum;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/zip/Checksum;->getValue()J

    move-result-wide v4
    :try_end_91
    .catchall {:try_start_80 .. :try_end_91} :catchall_9a

    .line 16
    :try_start_91
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_94
    .catchall {:try_start_91 .. :try_end_94} :catchall_98

    :try_start_94
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_97
    .catchall {:try_start_94 .. :try_end_97} :catchall_ad

    goto :goto_ad

    :catchall_98
    move-exception v6

    goto :goto_a4

    :catchall_9a
    move-exception v7

    .line 17
    :try_start_9b
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_9e
    .catchall {:try_start_9b .. :try_end_9e} :catchall_9f

    goto :goto_a3

    :catchall_9f
    move-exception v6

    :try_start_a0
    invoke-virtual {v7, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a3
    throw v7
    :try_end_a4
    .catchall {:try_start_a0 .. :try_end_a4} :catchall_98

    :goto_a4
    :try_start_a4
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_a7
    .catchall {:try_start_a4 .. :try_end_a7} :catchall_a8

    goto :goto_ac

    :catchall_a8
    move-exception p1

    :try_start_a9
    invoke-virtual {v6, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_ac
    throw v6
    :try_end_ad
    .catchall {:try_start_a9 .. :try_end_ad} :catchall_ad

    :catchall_ad
    :cond_ad
    :goto_ad
    const/4 p1, 0x0

    const/4 v6, 0x1

    .line 18
    :try_start_af
    new-instance v7, Ljava/util/zip/ZipFile;

    invoke-direct {v7, p0}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_b4
    .catch Ljava/lang/Exception; {:try_start_af .. :try_end_b4} :catch_137

    .line 19
    :try_start_b4
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object p0

    .line 20
    :cond_b8
    :goto_b8
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v8

    if-eqz v8, :cond_133

    .line 21
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/zip/ZipEntry;

    .line 22
    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_cf

    goto :goto_b8

    .line 23
    :cond_cf
    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->getCrc()J

    move-result-wide v9

    cmp-long v11, v4, v9

    if-eqz v11, :cond_b8

    .line 24
    new-array p0, v3, [B

    .line 25
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_e5

    .line 26
    invoke-virtual {v2, v6}, Ljava/io/File;->setWritable(Z)Z

    goto :goto_e5

    :catchall_e3
    move-exception p0

    goto :goto_139

    .line 27
    :cond_e5
    :goto_e5
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_ea
    .catchall {:try_start_b4 .. :try_end_ea} :catchall_e3

    .line 28
    :try_start_ea
    new-instance v3, Ljava/io/BufferedOutputStream;

    invoke-direct {v3, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_ef
    .catchall {:try_start_ea .. :try_end_ef} :catchall_114

    .line 29
    :try_start_ef
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-virtual {v7, v8}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_f8
    .catchall {:try_start_ef .. :try_end_f8} :catchall_116

    .line 30
    :goto_f8
    :try_start_f8
    invoke-virtual {v4, p0}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-eq v5, v1, :cond_104

    .line 31
    invoke-virtual {v3, p0, p1, v5}, Ljava/io/BufferedOutputStream;->write([BII)V
    :try_end_101
    .catchall {:try_start_f8 .. :try_end_101} :catchall_102

    goto :goto_f8

    :catchall_102
    move-exception p0

    goto :goto_118

    .line 32
    :cond_104
    :try_start_104
    invoke-virtual {v4}, Ljava/io/BufferedInputStream;->close()V
    :try_end_107
    .catchall {:try_start_104 .. :try_end_107} :catchall_116

    :try_start_107
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_10a
    .catchall {:try_start_107 .. :try_end_10a} :catchall_114

    :try_start_10a
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 33
    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->getCrc()J
    :try_end_113
    .catchall {:try_start_10a .. :try_end_113} :catchall_e3

    goto :goto_133

    :catchall_114
    move-exception p0

    goto :goto_12a

    :catchall_116
    move-exception p0

    goto :goto_121

    .line 34
    :goto_118
    :try_start_118
    invoke-virtual {v4}, Ljava/io/BufferedInputStream;->close()V
    :try_end_11b
    .catchall {:try_start_118 .. :try_end_11b} :catchall_11c

    goto :goto_120

    :catchall_11c
    move-exception v1

    :try_start_11d
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_120
    throw p0
    :try_end_121
    .catchall {:try_start_11d .. :try_end_121} :catchall_116

    :goto_121
    :try_start_121
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_124
    .catchall {:try_start_121 .. :try_end_124} :catchall_125

    goto :goto_129

    :catchall_125
    move-exception v1

    :try_start_126
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_129
    throw p0
    :try_end_12a
    .catchall {:try_start_126 .. :try_end_12a} :catchall_114

    :goto_12a
    :try_start_12a
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_12d
    .catchall {:try_start_12a .. :try_end_12d} :catchall_12e

    goto :goto_132

    :catchall_12e
    move-exception v0

    :try_start_12f
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_132
    throw p0
    :try_end_133
    .catchall {:try_start_12f .. :try_end_133} :catchall_e3

    .line 35
    :cond_133
    :goto_133
    :try_start_133
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->close()V
    :try_end_136
    .catch Ljava/lang/Exception; {:try_start_133 .. :try_end_136} :catch_137

    goto :goto_145

    :catch_137
    move-exception p0

    goto :goto_142

    .line 36
    :goto_139
    :try_start_139
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->close()V
    :try_end_13c
    .catchall {:try_start_139 .. :try_end_13c} :catchall_13d

    goto :goto_141

    :catchall_13d
    move-exception v0

    :try_start_13e
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_141
    throw p0
    :try_end_142
    .catch Ljava/lang/Exception; {:try_start_13e .. :try_end_142} :catch_137

    .line 37
    :goto_142
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    :goto_145
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_14c

    goto :goto_15f

    .line 39
    :cond_14c
    :try_start_14c
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x124

    invoke-static {p0, v0}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V
    :try_end_155
    .catch Landroid/system/ErrnoException; {:try_start_14c .. :try_end_155} :catch_156

    goto :goto_15f

    .line 40
    :catch_156
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 41
    invoke-virtual {v2, v6, p1}, Ljava/io/File;->setReadable(ZZ)Z

    .line 42
    invoke-virtual {v2, p1, p1}, Ljava/io/File;->setWritable(ZZ)Z

    .line 43
    :goto_15f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method
