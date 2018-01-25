-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-01-2018 a las 15:54:42
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `stacey`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `active`
--

CREATE TABLE `active` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `active`
--

INSERT INTO `active` (`id`, `name`, `description`) VALUES
(1, 'Sí', 'Sí'),
(2, 'No', 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actors`
--

CREATE TABLE `actors` (
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `height` varchar(100) NOT NULL,
  `spouse` varchar(100) NOT NULL,
  `children` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `binnacle`
--

CREATE TABLE `binnacle` (
  `id` int(5) NOT NULL,
  `user_id` int(5) NOT NULL,
  `module_id` int(5) NOT NULL,
  `action_id` int(5) NOT NULL,
  `created_at` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client`
--

CREATE TABLE `client` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `cellphone` varchar(100) NOT NULL,
  `documentnumber` varchar(100) NOT NULL,
  `documenttype_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `collection`
--

CREATE TABLE `collection` (
  `id` int(5) NOT NULL,
  `hight_cm` double NOT NULL,
  `hight_in` double NOT NULL,
  `width_cm` double NOT NULL,
  `width_in` double NOT NULL,
  `price` double NOT NULL,
  `model_id` int(5) NOT NULL,
  `submodel_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destroyed`
--

CREATE TABLE `destroyed` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `destroyed`
--

INSERT INTO `destroyed` (`id`, `name`, `description`) VALUES
(1, 'Sí', 'Sí'),
(2, 'No', 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documenttype`
--

CREATE TABLE `documenttype` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `active_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `documenttype`
--

INSERT INTO `documenttype` (`id`, `name`, `description`, `visible_id`, `active_id`, `destroyed_id`, `created_at`, `updated_at`) VALUES
(1, 'Factura', 'Facura', 1, 1, 2, '2018-01-23 02:44:04', '0000-00-00 00:00:00'),
(2, 'Orden de compra', 'Orden de compra', 1, 1, 2, '2018-01-23 02:44:20', '0000-00-00 00:00:00'),
(3, 'Cotización', 'Cotización', 1, 1, 2, '2018-01-23 02:44:47', '0000-00-00 00:00:00'),
(4, 'Cédula', 'Cédula', 1, 1, 2, '2018-01-23 02:45:23', '0000-00-00 00:00:00'),
(5, 'Pasaporte', 'Pasaporte', 1, 1, 1, '2018-01-23 02:45:31', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `locked`
--

CREATE TABLE `locked` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `locked`
--

INSERT INTO `locked` (`id`, `name`, `description`) VALUES
(1, 'Sí', 'Sí'),
(2, 'No', 'No');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `model`
--

CREATE TABLE `model` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `active_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `module`
--

CREATE TABLE `module` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permissions`
--

CREATE TABLE `permissions` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `display_name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `visible_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permission_role`
--

CREATE TABLE `permission_role` (
  `permission_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `price`
--

CREATE TABLE `price` (
  `id` int(5) NOT NULL,
  `code` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `active_id` int(5) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `price`
--

INSERT INTO `price` (`id`, `code`, `name`, `description`, `active_id`, `visible_id`, `destroyed_id`, `created_at`, `updated_at`) VALUES
(1, 'Zona Libre', 'Zona Libre', 'Zona Libre', 1, 1, 2, '2018-01-24 05:00:00', '2018-01-24 05:00:00'),
(2, 'Exterior', 'Exterior', 'Exterior', 1, 1, 2, '2018-01-24 05:00:00', '2018-01-24 05:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE `product` (
  `id` int(5) NOT NULL,
  `code` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `active_id` int(5) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product_price`
--

CREATE TABLE `product_price` (
  `product_id` int(5) NOT NULL,
  `price_id` int(5) NOT NULL,
  `price` double NOT NULL,
  `active_id` int(5) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `display_name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `active_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `visible_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id`, `name`, `display_name`, `description`, `created_at`, `updated_at`, `active_id`, `destroyed_id`, `visible_id`) VALUES
(1, 'Root', 'Root', 'Root', '2018-01-23 05:00:00', '2018-01-23 06:05:57', 1, 2, 1),
(2, 'Administrator', 'ADM', 'Administrator', '2018-01-23 05:00:00', '2018-01-23 06:06:17', 1, 2, 1),
(3, 'Owner', 'Owner', 'Owner', '2018-01-23 05:00:00', '2018-01-23 06:06:29', 1, 2, 1),
(4, 'Seller', 'Seller', 'Seller', '2018-01-23 05:00:00', '2018-01-24 18:03:43', 1, 1, 1),
(5, 'Managment', 'Managment', 'Managment', '2018-01-24 18:04:28', '2018-01-24 18:04:28', 1, 2, 1),
(6, 'Prueba', 'Prueba', 'Prueba', '2018-01-24 20:22:25', '2018-01-24 20:28:54', 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles_user`
--

CREATE TABLE `roles_user` (
  `user_id` int(5) NOT NULL,
  `role_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `security`
--

CREATE TABLE `security` (
  `id` int(5) NOT NULL,
  `key_update` varchar(100) NOT NULL,
  `key_upgrade` varchar(100) NOT NULL,
  `key_general` varchar(100) NOT NULL,
  `license_expire` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `id` int(5) NOT NULL,
  `product_id` int(5) NOT NULL,
  `quantity` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `submodel`
--

CREATE TABLE `submodel` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `active_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trademark`
--

CREATE TABLE `trademark` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `visible_id` int(5) NOT NULL,
  `active_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `cellphone` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `documenttype_id` int(5) NOT NULL,
  `documentnumber` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `active_id` int(5) NOT NULL,
  `visible_id` int(5) NOT NULL,
  `locked_id` int(5) NOT NULL,
  `destroyed_id` int(5) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `name`, `lastname`, `cellphone`, `email`, `documenttype_id`, `documentnumber`, `description`, `active_id`, `visible_id`, `locked_id`, `destroyed_id`, `created_at`, `updated_at`) VALUES
(1, 'Nombre1', 'Apellido1', '6541-1324', 'usuario@usuario.com', 4, '9-999-999', 'Una pequeña descripción.', 1, 1, 2, 2, '2018-01-24 19:18:26', '2018-01-25 14:38:24'),
(3, 'Nombre2', 'Apellido2', '6343-1124', 'usuario2@usuario.com', 4, '8-233-2344', 'Una pequeña descripción.', 1, 1, 2, 2, '2018-01-25 01:01:41', '2018-01-25 14:39:22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visible`
--

CREATE TABLE `visible` (
  `id` int(5) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `visible`
--

INSERT INTO `visible` (`id`, `name`, `description`) VALUES
(1, 'Sí', 'Sí'),
(2, 'No', 'No');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `active`
--
ALTER TABLE `active`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `binnacle`
--
ALTER TABLE `binnacle`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_client_documenttype` (`documenttype_id`);

--
-- Indices de la tabla `collection`
--
ALTER TABLE `collection`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_collection_mode` (`model_id`),
  ADD KEY `fk_collection_submode` (`submodel_id`);

--
-- Indices de la tabla `destroyed`
--
ALTER TABLE `destroyed`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `documenttype`
--
ALTER TABLE `documenttype`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_active_docummenttype` (`active_id`),
  ADD KEY `fk_visible_docummenttype` (`visible_id`),
  ADD KEY `fk_destroyed_docummenttype` (`destroyed_id`);

--
-- Indices de la tabla `locked`
--
ALTER TABLE `locked`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `model`
--
ALTER TABLE `model`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_visible_model` (`visible_id`),
  ADD KEY `fk_active_model` (`active_id`),
  ADD KEY `fk_destroyed_model` (`destroyed_id`);

--
-- Indices de la tabla `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `permissions`
--
ALTER TABLE `permissions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_active_permissions` (`active_id`),
  ADD KEY `fk_visible_permissions` (`visible_id`),
  ADD KEY `fk_destroyed_permissions` (`destroyed_id`);

--
-- Indices de la tabla `permission_role`
--
ALTER TABLE `permission_role`
  ADD PRIMARY KEY (`permission_id`);

--
-- Indices de la tabla `price`
--
ALTER TABLE `price`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_active_price` (`active_id`),
  ADD KEY `fk_visible_price` (`visible_id`),
  ADD KEY `fk_destroyed_price` (`destroyed_id`);

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_active_product` (`active_id`),
  ADD KEY `fk_visible_product` (`visible_id`),
  ADD KEY `fk_destroyed_product` (`destroyed_id`);

--
-- Indices de la tabla `product_price`
--
ALTER TABLE `product_price`
  ADD KEY `fk_active_pp` (`active_id`),
  ADD KEY `fk_visible_pp` (`visible_id`),
  ADD KEY `fk_destroyed_pp` (`destroyed_id`),
  ADD KEY `fk_product_pp` (`product_id`),
  ADD KEY `fk_price_pp` (`price_id`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_active_roles` (`active_id`),
  ADD KEY `fk_visible_roles` (`visible_id`),
  ADD KEY `fk_destroyed_roles` (`destroyed_id`);

--
-- Indices de la tabla `security`
--
ALTER TABLE `security`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `submodel`
--
ALTER TABLE `submodel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_active_submodel` (`active_id`),
  ADD KEY `fk_destroyed_submodel` (`destroyed_id`),
  ADD KEY `fk_visible_submodel` (`visible_id`);

--
-- Indices de la tabla `trademark`
--
ALTER TABLE `trademark`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_visible_trademark` (`visible_id`),
  ADD KEY `fk_active_trademark` (`active_id`),
  ADD KEY `fk_destroyed_trademark` (`destroyed_id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_user_active` (`active_id`),
  ADD KEY `fk_user_visible` (`visible_id`),
  ADD KEY `fk_user_locked` (`locked_id`),
  ADD KEY `fk_user_destroyed` (`destroyed_id`),
  ADD KEY `fk_user_documenttype` (`documenttype_id`);

--
-- Indices de la tabla `visible`
--
ALTER TABLE `visible`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `active`
--
ALTER TABLE `active`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `binnacle`
--
ALTER TABLE `binnacle`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `client`
--
ALTER TABLE `client`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `collection`
--
ALTER TABLE `collection`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `destroyed`
--
ALTER TABLE `destroyed`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `documenttype`
--
ALTER TABLE `documenttype`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `locked`
--
ALTER TABLE `locked`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `model`
--
ALTER TABLE `model`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `module`
--
ALTER TABLE `module`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `permissions`
--
ALTER TABLE `permissions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `price`
--
ALTER TABLE `price`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `product`
--
ALTER TABLE `product`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `security`
--
ALTER TABLE `security`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `stock`
--
ALTER TABLE `stock`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `submodel`
--
ALTER TABLE `submodel`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `trademark`
--
ALTER TABLE `trademark`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `visible`
--
ALTER TABLE `visible`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `fk_client_documenttype` FOREIGN KEY (`documenttype_id`) REFERENCES `documenttype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `collection`
--
ALTER TABLE `collection`
  ADD CONSTRAINT `fk_collection_mode` FOREIGN KEY (`model_id`) REFERENCES `model` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_collection_submode` FOREIGN KEY (`submodel_id`) REFERENCES `submodel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `documenttype`
--
ALTER TABLE `documenttype`
  ADD CONSTRAINT `fk_active_docummenttype` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_docummenttype` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_docummenttype` FOREIGN KEY (`visible_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `model`
--
ALTER TABLE `model`
  ADD CONSTRAINT `fk_active_model` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_model` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_model` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `permissions`
--
ALTER TABLE `permissions`
  ADD CONSTRAINT `fk_active_permissions` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_permissions` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_permissions` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `price`
--
ALTER TABLE `price`
  ADD CONSTRAINT `fk_active_price` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_price` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_price` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `fk_active_product` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_product` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_product` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `product_price`
--
ALTER TABLE `product_price`
  ADD CONSTRAINT `fk_active_pp` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_pp` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_price_pp` FOREIGN KEY (`price_id`) REFERENCES `price` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_product_pp` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_pp` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `roles`
--
ALTER TABLE `roles`
  ADD CONSTRAINT `fk_active_roles` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_roles` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_roles` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `submodel`
--
ALTER TABLE `submodel`
  ADD CONSTRAINT `fk_active_submodel` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_submodel` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_submodel` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `trademark`
--
ALTER TABLE `trademark`
  ADD CONSTRAINT `fk_active_trademark` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_destroyed_trademark` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_visible_trademark` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `fk_user_active` FOREIGN KEY (`active_id`) REFERENCES `active` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_user_destroyed` FOREIGN KEY (`destroyed_id`) REFERENCES `destroyed` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_user_documenttype` FOREIGN KEY (`documenttype_id`) REFERENCES `documenttype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_user_locked` FOREIGN KEY (`locked_id`) REFERENCES `locked` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_user_visible` FOREIGN KEY (`visible_id`) REFERENCES `visible` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
