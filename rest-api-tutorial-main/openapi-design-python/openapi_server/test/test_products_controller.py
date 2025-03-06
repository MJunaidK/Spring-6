# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.get_all_products200_response import GetAllProducts200Response  # noqa: E501
from openapi_server.models.product import Product  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProductsController(BaseTestCase):
    """ProductsController integration test stubs"""

    def test_create_product(self):
        """Test case for create_product

        Create a product
        """
        product = {"price":4.99,"name":"Coffee","description":"Arabica coffee beans","lastUpdatedOn":"2023-01-01T10:10:10Z","id":"1001"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/products-api/v1/products',
            method='POST',
            headers=headers,
            data=json.dumps(product),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_product(self):
        """Test case for delete_product

        Delete product
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/products-api/v1/products/{id}'.format(id='1001'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_products(self):
        """Test case for get_all_products

        List products
        """
        query_string = [('offset', 0),
                        ('limit', 5)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/products-api/v1/products',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_product(self):
        """Test case for get_product

        Get product details
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/products-api/v1/products/{id}'.format(id='1001'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_product(self):
        """Test case for update_product

        Update product's details
        """
        product = {"price":4.99,"name":"Coffee","description":"Arabica coffee beans","lastUpdatedOn":"2023-01-01T10:10:10Z","id":"1001"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/products-api/v1/products/{id}'.format(id='1001'),
            method='PUT',
            headers=headers,
            data=json.dumps(product),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
