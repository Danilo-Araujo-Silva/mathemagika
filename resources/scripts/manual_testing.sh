cd ../../
buffer_clear
rm -rf build buildSrc/build
rm -rf ~/.gradle/caches/modules-2/files-2.1/org.daniloaraujosilva*
./gradlew clean build
