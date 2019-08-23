<h1>POC-JDV-SECURITY-VAULT</h1>
<p>&nbsp;</p>
<h2>GOAL</h2>
<p><br />The goal of building this module is to be able to integrate Jboss EAP-based products into a password vault model that is agnostic to the java model. In this scenario the proposed password vault is made available by a provider that delivers the passwords to OAuth2.</p>
<p>&nbsp;</p>
<h2>Procedure</h2>
<h3>Jboss Configuration File (Standalone or Domain)</h3>
<p>At the end of the extension block</p>
<p>&lt;vault code="com.redhat.senhasegura.CustomSecurityVault" module="com.redhat.senhasegura"&gt;<br /> &lt;vault-option name="URL" value="https://senhasegura.localdomain"/&gt;<br /> &lt;vault-option name="ACCESS_TOKEN_PATH" value="/token_auth"/&gt;<br /> &lt;vault-option name="AUTORIZATION_TOKEN_PATH" value="/token_validate"/&gt;<br /> &lt;vault-option name="CLIENT_ID" value="JDVAppID"/&gt;<br /> &lt;vault-option name="ACCESS_TOKEN" value="Bearer-5dOaAVafCSd93nndek320"/&gt;<br /> &lt;vault-option name="EXPIRE_TOKEN" value="6000"/&gt;<br /> &lt;/vault&gt;</p>
<h3>Create the directory tree</h3>
<pre><code>cd $JBOSS_HOME
mkdir -p modules</code><span class="s1">/com/redhat/senhasegura/main</span></pre>
<h3>Create a module.xml&nbsp;</h3>
<p>&lt;module xmlns="urn:jboss:module:1.1" name="com.redhat.senhasegura"&gt;<br /> &lt;resources&gt;<br /> &lt;resource-root path="jdv-custom-vault.jar"/&gt;<br /> &lt;/resources&gt;<br /> &lt;dependencies&gt;<br /> &lt;module name="org.picketbox"/&gt;<br /> &lt;/dependencies&gt;<br />&lt;/module&gt;</p>
<h3>Deploy module</h3>
<p>mvn package</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2>Bibliography</h2>
<p><a href="https://access.redhat.com/solutions/300903">https://access.redhat.com/solutions/300903</a></p>
<p><a href="https://access.redhat.com/solutions/129843">https://access.redhat.com/solutions/129843</a></p>
<p><a href="https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform/6.4/html-single/development_guide/index#sect-Custom_Modules">https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform/6.4/html-single/development_guide/index#sect-Custom_Modules</a><a href="https://access.redhat.com/solutions/129843">https://access.redhat.com/solutions/129843</a></p>
<p>&nbsp;</p>
<div align="left">
    <a href="LICENSE.md">
        <img src="docs/assets/gpl-v3-logo.svg" width="100"/>
    </a>
</div>
<div align="left">
    <a href="https://travis-ci.org/{{gpas}{repo-owner-username}}/{gpas}{repo-name}}">
        <img alt="Travis Status" src="https://img.shields.io/travis/{{gpas}{repo-owner-username}}/{{gpas}{repo-name}}/master.svg?style=flat-square"/>
    </a>
</div>
