import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.get_all_products200_response import GetAllProducts200Response  # noqa: E501
from openapi_server.models.product import Product  # noqa: E501
from openapi_server import util

from datetime import datetime


def create_product(product=None):  # noqa: E501
    """Create a product

    Use this endpoint to add a new product to the catalog # noqa: E501

    :param product: Product Details
    :type product: dict | bytes

    :rtype: Union[Product, Tuple[Product, int], Tuple[Product, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        product = Product.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_product(id):  # noqa: E501
    """Delete product

    Use this endpoint to remove a product from the catalog # noqa: E501

    :param id: 
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_products(offset=None, limit=None):  # noqa: E501
    """List products

    Use this endpoint to browse all products in the catalog # noqa: E501

    :param offset: 
    :type offset: int
    :param limit: 
    :type limit: int

    :rtype: Union[GetAllProducts200Response, Tuple[GetAllProducts200Response, int], Tuple[GetAllProducts200Response, int, Dict[str, str]]
    """
    coffee = Product(1001, "Coffee", 4.99, "Coffee beans", datetime.now())
    chocolate = Product(2002, "Chocolate", 3.99, "Dark chocolate bar 90%", datetime.now())

    return [coffee, chocolate]


def get_product(id):  # noqa: E501
    """Get product details

    Use this endpoint to get details about a specific product # noqa: E501

    :param id: 
    :type id: str

    :rtype: Union[Product, Tuple[Product, int], Tuple[Product, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_product(id, product=None):  # noqa: E501
    """Update product&#39;s details

    Use this endpoint to update the product&#39;s details # noqa: E501

    :param id: 
    :type id: str
    :param product: Product Details
    :type product: dict | bytes

    :rtype: Union[Product, Tuple[Product, int], Tuple[Product, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        product = Product.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
