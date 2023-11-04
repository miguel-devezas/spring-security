# Spring Security Implementation Guide

## Overview

This repository contains a Spring Boot application configured with Spring Security to demonstrate a secure REST API. We have implemented OAuth 2.0 and OpenID Connect for authentication and authorization, providing a complete registration and login flow with email validation.

### What is Spring Security?

Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.

### What is OAuth 2.0 and OpenID Connect?

OAuth 2.0 is an authorization framework that enables applications to obtain limited access to user accounts on an HTTP service. OpenID Connect (OIDC) is a simple identity layer on top of OAuth 2.0, allowing for client applications to verify the identity of the end-user.

## Getting Started

To get the application running, follow these steps:

### Prerequisites

- JDK 11 or later
- Maven 3.2+
- MySQL or another relational database

### Running the application

1. Clone the repository:

```sh
git clone https://github.com/your-username/your-repository-name.git
