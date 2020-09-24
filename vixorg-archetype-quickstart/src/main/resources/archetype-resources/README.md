#set( $ldt = $package.getClass().forName("java.time.LocalDateTime").getMethod("now").invoke(null) )
#set( $dtf = $package.getClass().forName("java.time.format.DateTimeFormatter").getMethod("ofPattern", $package.getClass()).invoke(null, "yyyy-MM-dd HH:mm:ss") )
#set( $date = $ldt.format($dtf) )
#set( $getPropertyMethod = $package.getClass().forName("java.lang.System").getMethod("getProperty", $package.getClass()) )
#set( $archetypeGroupId = $getPropertyMethod.invoke(null, "archetypeGroupId") )
#set( $archetypeArtifactId = $getPropertyMethod.invoke(null, "archetypeArtifactId") )
#set( $archetypeVersion = $getPropertyMethod.invoke(null, "archetypeVersion") )
# ${artifactId}

**Generated from:** *[${archetypeGroupId}:${archetypeArtifactId}:v${archetypeVersion}](https://github.com/VixOrg/vixorg-archetypes/${archetypeArtifactId})*<br/>
**Generated on:** *${date}*<br/>
**Author:** *${author}*<br/>

This project is for &lt;add your description here&gt;



