#!/bin/bash
#
# Copyright 2017 Okta
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

#Using xmllint is faster than invoking maven
export ARTIFACT_VERSION="$(xmllint --xpath "//*[local-name()='project']/*[local-name()='version']/text()" pom.xml)"
export IS_RELEASE="$([ ${ARTIFACT_VERSION/SNAPSHOT} == $ARTIFACT_VERSION ] && [ $TRAVIS_BRANCH == 'master' ] && echo 'true')"

echo "Build configuration:"
echo "Version:             ${ARTIFACT_VERSION}"
echo "Is release:          ${IS_RELEASE:-false}"
echo
echo "Replaced Java and Maven versions:"
mvn --version
