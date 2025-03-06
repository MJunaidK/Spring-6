# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "openapi_server"
VERSION = "1.0.0"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "connexion>=2.0.2",
    "swagger-ui-bundle>=0.0.2",
    "python_dateutil>=2.6.0"
]

setup(
    name=NAME,
    version=VERSION,
    description="Products API",
    author_email="",
    url="",
    keywords=["OpenAPI", "Products API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    package_data={'': ['openapi/openapi.yaml']},
    include_package_data=True,
    entry_points={
        'console_scripts': ['openapi_server=openapi_server.__main__:main']},
    long_description="""\
    This a sample specification part of a YT tutorial showcasing how to design a RESTful API contract using OpenAPI.  We are going to create an API to manage products with the the following operations: * List all Products * Create a Product * Get Product details * Update Product * Delete Product  We will cover also the following topics: * Result pagination * Security (Auth&#39;n / Auth&#39;z)  We will use a simple **Product** resource representation with the following properties: * ID * Name * Price * Description (optional) * Last updated date-time 
    """
)

