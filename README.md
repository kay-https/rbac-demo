# 🔐 RBAC com Spring Boot

Projeto criado no **Day 4/30 do desafio #30DaysOfJavaWithKay**.

A ideia é implementar um **controle de acesso por roles (RBAC)** do zero usando Spring Boot, sem Spring Security, para entender como a autorização funciona por baixo dos panos.

---

## 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## 🧠 O que foi implementado

- Cadastro de usuários com roles (ADMIN, USER)
- Enum de permissões
- Annotation custom `@RequiresRole`
- Interceptor para validar acesso
- Simulação de autenticação via Header
- Bloqueio automático com 401 e 403

---

## 🔐 Como funciona

O cliente envia no header:

