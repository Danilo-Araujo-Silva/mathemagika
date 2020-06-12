# cd ../../
# buffer_clear
# rm -rf build buildSrc/build
# rm -rf ~/.gradle/caches/modules-2/files-2.1/org.daniloaraujosilva*
# ./gradlew clean build

rm -rf ~/.m2/repository/com/daniloaraujosilva \
&& rm -rf library/build/libs \
&& tree ~/.m2/repository/com/daniloaraujosilva \
&& tree library/build/libs \
&& ./gradlew build \
&& ./gradlew publishToMavenLocal \
&& tree library/build/libs \
&& tree ~/.m2/repository/com/daniloaraujosilva
