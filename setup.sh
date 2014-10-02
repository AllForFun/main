#!Bin/Bash
cd ${PWD}
mkdir .temp
cd ./.temp
wget http://files.minecraftforge.net/minecraftforge/minecraftforge-src-latest.zip -O mcforge.zip
unzip file.zip -d ./mcforge
cd ..
mv ./.temp/mcforge/eclipse ./
mv build.gradle ./.temp/build.gradle
mv ./.temp/mcforge/build.gradle ./
./gradlew setupdecompworkspace —-refresh-dependencies
./gradlew eclipse
rm build.gradle
mv ./.temp/build.gradle build.gradle
rm -rf ./.temp